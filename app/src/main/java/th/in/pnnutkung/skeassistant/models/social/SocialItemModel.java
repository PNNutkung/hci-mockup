package th.in.pnnutkung.skeassistant.models.social;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import th.in.pnnutkung.skeassistant.BR;

/**
 * Created by nut on 17/9/2559.
 */
public class SocialItemModel extends BaseObservable {

    private String channelName;

    public SocialItemModel(String channelName) {
        setChannelName(channelName);
    }

    @Bindable
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
        notifyPropertyChanged(BR.channelName);
    }
}
