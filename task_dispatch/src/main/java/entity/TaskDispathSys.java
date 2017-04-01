package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "task_dispatch_sys",catalog ="local")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TaskDispathSys implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Integer id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="path")
	private String path;
	
	@Column(name="purpose")
	private String purpose;
	
	@Column(name="mysql")
	private String mysql;
	
	@Column(name="hive")
	private String hive;
	
	@Column(name="dependency")
	private String dependency;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getMysql() {
		return mysql;
	}
	public void setMysql(String mysql) {
		this.mysql = mysql;
	}
	public String getHive() {
		return hive;
	}
	public void setHive(String hive) {
		this.hive = hive;
	}
	public String getDependency() {
		return dependency;
	}
	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	}
