package edu.dlufl.ohrigei.dao

import edu.dlufl.ohrigei.model.Admin
import edu.dlufl.ohrigei.model.Committee
import edu.dlufl.ohrigei.model.Delegate
import edu.dlufl.ohrigei.model.Group

interface AdminDao {
    List<Delegate> queryAllMember(int type)

    List<Group> queryAllGroup()

    List<Admin> queryAllAdmin()

    List<Committee> queryAllCommittee()
}