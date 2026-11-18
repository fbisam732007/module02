package test_slack.project1.repository;

import test_slack.project1.entity.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository {
    private final List<PhuongTien> data = new ArrayList<>();

    public List<PhuongTien> findAll() {
        return data;
    }

    public PhuongTien findByBienSo(String bienSo) {
        for (PhuongTien p : data) {
            if (p.getBienKiemSoat().equalsIgnoreCase(bienSo)) return p;
        }
        return null;
    }

    public void save(PhuongTien p) {
        data.add(p);
    }

    public boolean delete(PhuongTien p) {
        return data.remove(p);
    }
}
