package archityadav.passwordgenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsernameInputActivity extends AppCompatActivity
{

    //Button button = (Button) findViewById(R.id.nextButton1);
    EditText usernameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username_input);

        usernameEditText = (EditText) findViewById(R.id.usernameEditText);

    }

    public void gotoNextActivity(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("username", usernameEditText.getText());   //key, value
        /* Would send this data to the next activity...*/

        Intent nextActivityIntent = new Intent(getApplicationContext(), KeywordInputActivity.class);
        startActivity(nextActivityIntent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        /* Goes to the nextactivity UsernameInput...*/
    }
}
