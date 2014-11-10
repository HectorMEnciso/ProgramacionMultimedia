package course.examples.helloWorldWithLogin;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);//Establece el layout "loginscreen"

		final EditText uname = (EditText) findViewById(R.id.username_edittext);//Obtiene una referencia al control del layout EditText "uname"
		final EditText passwd = (EditText) findViewById(R.id.password_edittext);//Obtiene una referencia al control del layout c
		final Button loginButton = (Button) findViewById(R.id.login_button);//Obtiene una referencia al control del layout Button "loginButton"
		
		loginButton.setOnClickListener(new OnClickListener() {//Define el escuchador sobre el boton "loginButton"
			
			public void onClick(View v) {//Metodo onClick
				
				if (checkPassword(uname.getText(), passwd.getText())) {//Obtenemos el contenido de ambas EditText
					
					// Create an explicit Intent for starting the HelloAndroid Activity 
					Intent helloAndroidIntent = new Intent(LoginScreen.this,HelloAndroid.class);//Define un intent "helloAndroidIntent" que se comunica con la clase HelloAndroid
					
					// Use the Intent to start the HelloAndroid Activity 
					startActivity(helloAndroidIntent);//Usamos el intent para ir a la actividad HelloAndroid

				} else {
					uname.setText("");
					passwd.setText("");
				}
			}
		});
	}

	private boolean checkPassword(Editable uname, Editable passwd) {//Metodo al que le pasamos el editText "uname" y el "passwd"
		// Just pretending to extract text and check password
		return new Random().nextBoolean();//Devuelve un random de tipo Boolean aleatorio
	}
}
