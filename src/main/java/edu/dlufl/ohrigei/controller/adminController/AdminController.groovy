package edu.dlufl.ohrigei.controller.adminController


import edu.dlufl.ohrigei.service.adminService.service.AdminQueryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import javax.servlet.http.HttpSession

@Controller
@RequestMapping("/admin")
class AdminController {
    @Autowired
    AdminQueryService adminQueryService

    @RequestMapping("/DashBoard")
    String dashboard() {
        return "admin/DashBoard";
    }

    @RequestMapping("/manage")
    String queryMembers(HttpSession session, Model model, String type) {
        switch (type) {
            case "Admin":
                return adminQueryService.queryAdmin(session, model)
            case "Committee":
                return adminQueryService.queryCommittee(session, model)
            case "Group":
                return adminQueryService.queryGroup(session, model)
            case "Seat": break
            default:
                try {
                    return adminQueryService.queryMembers(session, model, type)
                }
                catch (Exception e) {
                    System.out.println("An error occur" + e)
                }
        }
        return "admin/DashBoard"
    }
}
