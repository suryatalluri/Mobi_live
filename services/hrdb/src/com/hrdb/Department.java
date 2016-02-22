/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.hrdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="`DEPARTMENT`"
    ,schema="PUBLIC"
)

public class Department  implements java.io.Serializable {

    private Integer deptid;
    private String name;
    private Integer budget;
    private Integer q1;
    private Integer q2;
    private Integer q3;
    private Integer q4;
    private String deptcode;
    private String location;
    private Integer tenantid;
    private Set<Employee> employees = new HashSet<Employee>(0);

    public Department() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`DEPTID`", nullable=false, precision=10)
    public Integer getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    

    @Column(name="`NAME`")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    

    @Column(name="`BUDGET`", precision=10)
    public Integer getBudget() {
        return this.budget;
    }
    
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    

    @Column(name="`Q1`", precision=10)
    public Integer getQ1() {
        return this.q1;
    }
    
    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    

    @Column(name="`Q2`", precision=10)
    public Integer getQ2() {
        return this.q2;
    }
    
    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    

    @Column(name="`Q3`", precision=10)
    public Integer getQ3() {
        return this.q3;
    }
    
    public void setQ3(Integer q3) {
        this.q3 = q3;
    }

    

    @Column(name="`Q4`", precision=10)
    public Integer getQ4() {
        return this.q4;
    }
    
    public void setQ4(Integer q4) {
        this.q4 = q4;
    }

    

    @Column(name="`DEPTCODE`", length=20)
    public String getDeptcode() {
        return this.deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    

    @Column(name="`LOCATION`")
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    

    @Column(name="`TENANTID`", precision=10)
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="department")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Department) )
		    return false;

		 Department that = (Department) o;

		 return ( (this.getDeptid()==that.getDeptid()) || ( this.getDeptid()!=null && that.getDeptid()!=null && this.getDeptid().equals(that.getDeptid()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDeptid() == null ? 0 : this.getDeptid().hashCode() );

         return result;
    }


}

