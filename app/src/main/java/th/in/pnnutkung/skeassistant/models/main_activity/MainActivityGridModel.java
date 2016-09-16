package th.in.pnnutkung.skeassistant.models.main_activity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;

import th.in.pnnutkung.skeassistant.BR;

/**
 * Created by nut on 16/9/2559.
 */
public class MainActivityGridModel extends BaseObservable {

    private Drawable icon;
    private String description;

    public MainActivityGridModel(Drawable icon, String description) {
        setDescription(description);
        setIcon(icon);
    }

    @Bindable
    public Drawable getIcon() {
        return icon;
    }


    public void setIcon(Drawable icon) {
        this.icon = icon;
        notifyPropertyChanged(BR.icon);
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyPropertyChanged(BR.description);
    }
}
