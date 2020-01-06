package br.nom.wbarbosa.wbviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.nom.wbarbosa.wbviagens.R;
import br.nom.wbarbosa.wbviagens.model.Pacote;
import br.nom.wbarbosa.wbviagens.util.DiasUtil;
import br.nom.wbarbosa.wbviagens.util.MoedaUtil;
import br.nom.wbarbosa.wbviagens.util.ResourceUtil;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private final DiasUtil diasUtils = new DiasUtil();
    private final MoedaUtil moedaUtil = new MoedaUtil();
    private Context context;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Object getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        setLocal(view, pacote);
        setImagem(view, pacote);
        setDias(view, pacote);
        setPreco(view, pacote);

        return view;

    }

    private void setPreco(View view, Pacote pacote) {
        TextView preco = view.findViewById(R.id.item_pacote_preco);
        preco.setText(
                MoedaUtil.setPrecoEmMoedaBrasileira(pacote.getPreco()));
    }

    private void setDias(View view, Pacote pacote) {
        TextView dias = view.findViewById(R.id.item_pacote_dias);
        dias.setText(DiasUtil.getDiasString(pacote.getDias()));
    }

    private void setImagem(View view, Pacote pacote) {
        ImageView imagem = view.findViewById(R.id.item_pacote_imagem);
        Drawable drawableImagemPacote = ResourceUtil.getDrawable(context, pacote);
        imagem.setImageDrawable(drawableImagemPacote);
    }


    private void setLocal(View view, Pacote pacote) {
        TextView local = view.findViewById(R.id.item_pacote_local);
        local.setText(pacote.getLocal());
    }
}

