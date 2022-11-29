package com.saran.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MEETINGM2M")
public class Meeting {
 
    @Id
    @Column(name="MEETING_ID")
    @GeneratedValue
    private Long meetingId;
 
    @Column(name="SUBJECT")
    private String subject;
     
    @Column(name="MEETING_DATE")
    private Date meetingDate;
     
    @ManyToMany(mappedBy="meetings")  //bi-directional
    private Set<Employee> employees = new HashSet<Employee>();
     
    public Meeting(String subject) {
        this.subject = subject;
        this.meetingDate = new Date();
    }

}