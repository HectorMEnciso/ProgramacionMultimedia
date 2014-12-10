package net.learn2develop.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FilesActivity extends Activity {
	EditText textBox;
	static final int READ_BLOCK_SIZE = 100;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		textBox = (EditText) findViewById(R.id.txtText1);
		
        InputStream is = this.getResources().openRawResource(R.raw.textfile);//obtiene el recurso
        BufferedReader br = new BufferedReader(new InputStreamReader(is));// abre el fichero en modo lectura
        String str = null;
        try {
            while ((str = br.readLine()) != null) {
                Toast.makeText(getBaseContext(), 
                    str, Toast.LENGTH_SHORT).show();
            }
            is.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	public void onClickSave(View view) {
		String str = textBox.getText().toString();
		try
		{
            //---SD Card Storage---
            File sdCard = Environment.getExternalStorageDirectory();//obtiene ruta raiz
            File directory = new File (sdCard.getAbsolutePath() +"/MyFiles");//obtiene la ruta a la que le concatena el directorio MyFiles
            directory.mkdirs();//crea el directorio
            File file = new File(directory, "textfile.txt");//crea un objeto con referencia a ese archivo.
            FileOutputStream fOut = new FileOutputStream(file);

            /*			
			FileOutputStream fOut =
					openFileOutput("textfile.txt",
							MODE_WORLD_READABLE);
			*/
                        
			OutputStreamWriter osw = new OutputStreamWriter(fOut);//flujo de escritura para fichero

			//---write the string to the file---
			osw.write(str);//escrbe
			osw.flush(); //para evitar que no se quede nada en memoria.
			osw.close();

			//---display file saved message---
			Toast.makeText(getBaseContext(),"File saved successfully!",Toast.LENGTH_SHORT).show();
			//---clears the EditText---
			textBox.setText("");//varia textBox
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void onClickLoad(View view) {
		try
		{
			//---SD Storage---
            File sdCard = Environment.getExternalStorageDirectory();//obtiene ruta raiz
            File directory = new File (sdCard.getAbsolutePath() + "/MyFiles");//obtiene la ruta a la que le concatena el directorio MyFiles
            File file = new File(directory, "textfile.txt");//crea un objeto con referencia a ese archivo.
            FileInputStream fIn = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fIn);

            /*
			FileInputStream fIn = 
					openFileInput("textfile.txt");
			InputStreamReader isr = new 
					InputStreamReader(fIn);
            */
            
			char[] inputBuffer = new char[READ_BLOCK_SIZE];//crea vector de chars de 100
			String s = "";

			int charRead;
			while ((charRead = isr.read(inputBuffer))>0)
			{
				//---convert the chars to a String---
				String readString =String.copyValueOf(inputBuffer, 0,charRead);
				s += readString;

				inputBuffer = new char[READ_BLOCK_SIZE];
			}
			//---set the EditText to the text that has been 
			// read---
			textBox.setText(s);

			Toast.makeText(getBaseContext(),"File loaded successfully!",Toast.LENGTH_SHORT).show();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}