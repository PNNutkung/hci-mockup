package th.in.pnnutkung.skeassistant.models.announcement;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import th.in.pnnutkung.skeassistant.BR;

/**
 * Created by nut on 17/9/2559.
 */
public class AnnouncementItemModel extends BaseObservable {
    private String announceTitle;
    private String announceDesc;

    public AnnouncementItemModel(String announceTitle, String announceDesc) {
        setAnnounceTitle(announceTitle);
        setAnnounceDesc(announceDesc);
    }

    @Bindable
    public String getAnnounceTitle() {
        return announceTitle;
    }

    public void setAnnounceTitle(String announceTitle) {
        this.announceTitle = announceTitle;
        notifyPropertyChanged(BR.announceTitle);
    }

    @Bindable
    public String getAnnounceDesc() {
        return announceDesc;
    }

    public void setAnnounceDesc(String announceDesc) {
        this.announceDesc = announceDesc;
        notifyPropertyChanged(BR.announceDesc);
    }
}
