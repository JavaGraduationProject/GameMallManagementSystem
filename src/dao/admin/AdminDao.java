package dao.admin;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import entity.Admin;
import entity.User;
@Mapper
public interface AdminDao{ //��������ӳ�������Id��Ӧ
	public List<Admin> login(Admin admin);
}
