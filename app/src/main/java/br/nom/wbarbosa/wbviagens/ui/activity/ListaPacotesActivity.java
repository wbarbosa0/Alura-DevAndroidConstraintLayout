package br.nom.wbarbosa.wbviagens.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import br.nom.wbarbosa.wbviagens.R;
import br.nom.wbarbosa.wbviagens.dao.PacoteDAO;
import br.nom.wbarbosa.wbviagens.model.Pacote;
import br.nom.wbarbosa.wbviagens.ui.adapter.ListaPacotesAdapter;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        ListView listaPacotes = findViewById(R.id.activity_lista_pacotes_lista);

        List<Pacote> pacotes = new PacoteDAO().lista();
        listaPacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }
}
