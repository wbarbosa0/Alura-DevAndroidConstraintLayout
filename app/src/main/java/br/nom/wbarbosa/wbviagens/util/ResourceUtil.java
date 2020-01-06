package br.nom.wbarbosa.wbviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.nom.wbarbosa.wbviagens.model.Pacote;

public class ResourceUtil {

    private static final String DRAWABLE = "drawable";

    public static Drawable getDrawable(Context context, Pacote pacote) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(pacote.getImagem()
                , DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }

}
