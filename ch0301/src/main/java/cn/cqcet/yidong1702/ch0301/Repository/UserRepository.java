package cn.cqcet.yidong1702.ch0301.Repository;

import cn.cqcet.yidong1702.ch0301.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * FileName: UserRepository
 * Author:   刘帅
 * Date:     2019-9-18 16:44
 */
public interface UserRepository extends CrudRepository<User,Integer> {

}
