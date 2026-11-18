package test_slack.project1.repository;

import test_slack.project1.entity.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatRepository {
    private final List<HangSanXuat> data = new ArrayList<>();

    public HangSanXuatRepository() {
        data.add(new HangSanXuat("HSX-001", "Toyota", "Nhật Bản"));
        data.add(new HangSanXuat("HSX-002", "Hyundai", "Hàn Quốc"));
        data.add(new HangSanXuat("HSX-003", "Honda", "Nhật Bản"));
    }

    public List<HangSanXuat> findAll() {
        return data;
    }

    public HangSanXuat findByTen(String ten) {
        for (HangSanXuat hang : data) {
            if (hang.getTenHang().equalsIgnoreCase(ten)) return hang;
        }
        return null;
    }
}
