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

public class ImportantFragment extends Fragment {

    private FragmentAnnouncementRecyclerViewBinding binding;
    private List<AnnouncementItemModel> announcementItemModelList;

    public static ImportantFragment newInstance() {
        ImportantFragment fragment = new ImportantFragment();
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

    private void initDataList() {
        announcementItemModelList = new ArrayList<>();
        announcementItemModelList.add(new AnnouncementItemModel("Open House to Industries and Business", "ลงทะเบียน Online @website :: https://sci.ku.ac.th/news/3402-2"));
        announcementItemModelList.add(new AnnouncementItemModel("KU NIGHT EAT&READ MID-TERM EXAMS", "19 - 30 Sept. Revise for exam available at Cafeteria 1!"));
        announcementItemModelList.add(new AnnouncementItemModel("โครงการ อิ่มบุญ อิ่มใจ อิ่มท้อง กับเทศกาลอาหารเจ", "ขอเชิญร่วมงานเทศกาลอาหารเจ โครงการอิ่มบุญ อิ่มใจ อิ่มท้อง กับเทศกาลอาหารเจ ณ โรงอาหารกลาง 1 และ 2"));
        announcementItemModelList.add(new AnnouncementItemModel("Thailand Green Design Awards 2017", "การประกวดผลิตภัณฑ์ที่เป็นมิตรต่อสิ่งแวดล้อม Thailand Green Design Awards"));
        announcementItemModelList.add(new AnnouncementItemModel("กำหนดการให้กู้ยืม กยศ. และ การให้กู้ยืม กรอ.", "กำหนดการให้กู้ยืม กยศ. และ การให้กู้ยืม กรอ."));
        announcementItemModelList.add(new AnnouncementItemModel("Library Orientation for the Academic Year 2016", "tudents are invited to attend the “Library Orientation for the Academic Year 2016” (the session is in Thai) during August 22, 2016 – September 30, 2016 (for 30 days)"));
        announcementItemModelList.add(new AnnouncementItemModel("โครงการ คุณบอก... เราทำ", "เพื่อให้อาจารย์ นิสิต และบุคลากรเข้ามามีส่วนร่วม เสนอแนะปัญหาที่เกี่ยวกับสภาพแวดล้อม ภูมิทัศน์ ระบบสาธารณูปโภค และพื้นที่ส่วนกลาง เพื่อกองยานพาหนะฯ จะดำเนินการพัฒนา"));
    }

    private void initRecyclerView() {
        AnnouncementLinearViewAdapter linearViewAdapter = new AnnouncementLinearViewAdapter(announcementItemModelList);
        binding.announcementRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this.getActivity()).build());
        binding.announcementRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        binding.announcementRecyclerView.setAdapter(linearViewAdapter);
    }
}
