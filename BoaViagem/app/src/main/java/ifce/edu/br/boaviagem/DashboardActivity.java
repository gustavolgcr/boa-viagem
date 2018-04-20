package ifce.edu.br.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gustavolgcr on 2018-04-13.
 */

public class DashboardActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view) {

        /*
            CRIAR INTENT BASEADA NA VIEW clicada
         */

        TextView textView = (TextView) view;
        String opcao = "Opção: " + textView.getText().toString();

        Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();


    }

}
