package com.xanthron.keralamarry.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xanthron.keralamarry.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //login page controll
        logbutton_card.setOnClickListener {
            var user = username
            var pass = password
            if (user.text.isEmpty() || pass.text.isEmpty()) {
                if (user.length() == 0) {
                    user.requestFocus();
                    user.error = "FIELD CANNOT BE EMPTY";
                }
                if (pass.length() == 0) {
                    pass.requestFocus();
                    pass.error = "FIELD CANNOT BE EMPTY"
                }

            } else {

            }
        }

        //forget password
        forgotpass.setOnClickListener {

        }

        //create account page
        creatacc.setOnClickListener {

        }

    }
}