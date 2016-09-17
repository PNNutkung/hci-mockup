package th.in.pnnutkung.skeassistant.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.FragmentAnnouncementRecyclerViewBinding;
import th.in.pnnutkung.skeassistant.models.announcement.AnnouncementItemModel;
import th.in.pnnutkung.skeassistant.recycler_views.announcement.AnnouncementLinearViewAdapter;

public class HomeworkFragment extends Fragment {

    private FragmentAnnouncementRecyclerViewBinding binding;
    private List<AnnouncementItemModel> announcementItemModelList;

    public static HomeworkFragment newInstance() {
        HomeworkFragment fragment = new HomeworkFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_announcement_recycler_view,container, false);
        initDataList();
        initRecyclerView();
        return binding.getRoot();
    }

    private void initRecyclerView() {
        AnnouncementLinearViewAdapter linearViewAdapter = new AnnouncementLinearViewAdapter(announcementItemModelList);
        binding.annoucementRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this.getActivity()).build());
        binding.annoucementRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        binding.annoucementRecyclerView.setAdapter(linearViewAdapter);
    }

    private void initDataList() {
        announcementItemModelList = new ArrayList<>();
        announcementItemModelList.add(new AnnouncementItemModel("KR", "First Logic Order."));
        announcementItemModelList.add(new AnnouncementItemModel("WSP", "SUMS, SRS, SUMQ, SUMP."));
        announcementItemModelList.add(new AnnouncementItemModel("HCI", "APK app."));
    }
}
