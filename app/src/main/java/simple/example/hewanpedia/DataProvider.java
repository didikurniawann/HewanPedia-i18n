package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Harimau;
import simple.example.hewanpedia.model.Macan;
import simple.example.hewanpedia.model.Singa;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Singa> initDataSinga(Context ctx) {
        List<Singa> singas = new ArrayList<>();
        singas.add(new Singa(ctx.getString(R.string.katanga_nama), ctx.getString(R.string.katanga_asal),
                ctx.getString(R.string.katanga_deskripsi), R.drawable.singa_katanga));
        singas.add(new Singa(ctx.getString(R.string.kongo_nama), ctx.getString(R.string.kongo_asal),
                ctx.getString(R.string.kongo_deskripsi), R.drawable.singa_kongo));
        singas.add(new Singa(ctx.getString(R.string.transval_nama), ctx.getString(R.string.transval_asal),
                ctx.getString(R.string.transval_deskripsi), R.drawable.singa_transvaal));
        singas.add(new Singa(ctx.getString(R.string.barbary_nama), ctx.getString(R.string.barbary_asal),
                ctx.getString(R.string.barbary_deskripsi), R.drawable.singa_barbary));
        singas.add(new Singa(ctx.getString(R.string.afrika_timur_nama), ctx.getString(R.string.afrika_timur_asal),
                ctx.getString(R.string.afrika_timur_deskripsi), R.drawable.singa_afrika_timur));
        singas.add(new Singa(ctx.getString(R.string.asia_nama), ctx.getString(R.string.asia_asal),
                ctx.getString(R.string.asia_deskripsi), R.drawable.singa_asia));
        return singas;
    }

    private static List<Macan> initDataMacan(Context ctx) {
        List<Macan> macans = new ArrayList<>();
        macans.add(new Macan(ctx.getString(R.string.srilanka_nama), ctx.getString(R.string.srilanka_asal),
                ctx.getString(R.string.srilanka_deskripsi), R.drawable.macan_srilanka));
        macans.add(new Macan(ctx.getString(R.string.jawa_nama), ctx.getString(R.string.jawa_asal),
                ctx.getString(R.string.jawa_deskripsi), R.drawable.macan_jawa));
        macans.add(new Macan(ctx.getString(R.string.indochina_nama), ctx.getString(R.string.indochina_asal),
                ctx.getString(R.string.indochina_deskripsi), R.drawable.macan_indoochina));
        macans.add(new Macan(ctx.getString(R.string.amur_nama), ctx.getString(R.string.amur_asal),
                ctx.getString(R.string.amur_deskripsi), R.drawable.macan_amur));
        macans.add(new Macan(ctx.getString(R.string.cina_utara_nama), ctx.getString(R.string.cina_utara_asal),
                ctx.getString(R.string.cina_utara_deskripsi), R.drawable.macan_cina_utara));
        macans.add(new Macan(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.macan_persia));
        return macans;
    }

    private static List<Harimau> initDataHarimau(Context ctx) {
        List<Harimau> harimaus = new ArrayList<>();
        harimaus.add(new Harimau(ctx.getString(R.string.bengal_nama), ctx.getString(R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi), R.drawable.harimau_bengal));
        harimaus.add(new Harimau(ctx.getString(R.string.indocina_nama), ctx.getString(R.string.indocina_asal),
                ctx.getString(R.string.indocina_deskripsi), R.drawable.harimau_indocina));
        harimaus.add(new Harimau(ctx.getString(R.string.malaya_nama), ctx.getString(R.string.malaya_asal),
                ctx.getString(R.string.malaya_deskripsi), R.drawable.harimau_malaya));
        harimaus.add(new Harimau(ctx.getString(R.string.sumatera_nama), ctx.getString(R.string.sumatera_asal),
                ctx.getString(R.string.sumatera_deskripsi), R.drawable.harimau_sumatera));
        harimaus.add(new Harimau(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.harimau_siberia));
        harimaus.add(new Harimau(ctx.getString(R.string.cina_selatan_nama), ctx.getString(R.string.cina_selatan_asal),
                ctx.getString(R.string.cina_selatan_deskripsi), R.drawable.harimau_cinaselatan));
        return harimaus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSinga(ctx));
        hewans.addAll(initDataMacan(ctx));
        hewans.addAll(initDataHarimau(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
