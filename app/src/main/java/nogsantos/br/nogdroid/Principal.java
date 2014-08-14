package nogsantos.br.nogdroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


public class Principal extends Activity {

    final private Context context = Principal.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        /*
         * Buttons Objects
         */
        final ImageButton btLogo     = (ImageButton) findViewById(R.id.btLogo);
        final ImageButton btFaceBook = (ImageButton) findViewById(R.id.btFacebook);
        final ImageButton btLinkedIn = (ImageButton) findViewById(R.id.btLinkedin);
        final ImageButton btGitHub   = (ImageButton) findViewById(R.id.btGitHub);
        final ImageButton btMe       = (ImageButton) findViewById(R.id.btMe);
        final ImageButton btMail     = (ImageButton) findViewById(R.id.btMail);
        final ImageButton btCall     = (ImageButton) findViewById(R.id.btCall);
        final ImageButton btTwitter  = (ImageButton) findViewById(R.id.btTwitter);
        final ImageButton btGplus    = (ImageButton) findViewById(R.id.btGplus);
        final ImageButton btAndroid  = (ImageButton) findViewById(R.id.btAndroid);
        /*
         * Listeners
         */
        /*
         * Logo
         */
        btLogo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("http://www.nogsantos.com.br");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }

        });
        /*
         * FaceBook
         */
        btFaceBook.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("https://www.facebook.com/nogsantos");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }

        });
        /*
         *  Linked in
         */
        btLinkedIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("http://www.linkedin.com/in/nogsantos");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Git Hub
         */
        btGitHub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("https://github.com/nogsantos");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Me
         */
        btMe.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Intent bioActivity = new Intent(context, Bio.class);
                    startActivity(bioActivity);
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Mail
         */
        btMail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try {
                    Intent sendMail = new Intent(Intent.ACTION_VIEW);
                    Uri mail = Uri.parse("mailto:nogsantos@gmail.com?subject=Contato via mobile App&body=");
                    sendMail.setData(mail);
                    startActivity(sendMail);
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Call
         */
        btCall.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    String number     = "tel:91161686";
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
                    startActivity(callIntent);
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Twitter
         */
        btTwitter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("https://twitter.com/nogsantos");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Google plus
         */
        btGplus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Uri uri = Uri.parse("https://www.google.com/+FabricioNogueira-nogsantos");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
        /*
         * Applications
         */
        btAndroid.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                try{
                    Intent menuActivity = new Intent(context, MenuApplications.class);
                    startActivity(menuActivity);
                }catch (Exception e){
                    Toast.makeText(context,e.getMessage(),Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

    }
}
