package test_slack.project1;

import test_slack.project1.controller.PhuongTienController;
import test_slack.project1.repository.HangSanXuatRepository;
import test_slack.project1.repository.PhuongTienRepository;
import test_slack.project1.service.PhuongTienService;
import test_slack.project1.view.PhuongTienView;

public class Main {
    public static void main(String[] args) {
        HangSanXuatRepository hangRepo = new HangSanXuatRepository();
        PhuongTienRepository phuongTienRepo = new PhuongTienRepository();

        PhuongTienService service = new PhuongTienService(phuongTienRepo, hangRepo);
        PhuongTienView view = new PhuongTienView();
        PhuongTienController controller = new PhuongTienController(service, view);

        controller.chay();
    }
}
