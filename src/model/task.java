package model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
        name = "getAlltask",
        query = "SELECT t FROM task AS t ORDER BY t.id DESC"
    )
})

@Table(name = "task")

public class task {


	  @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "title", length = 255, nullable = false)
	    private String title;



	    @Column(name = "updated_at", nullable = false)
	    private Timestamp updated_at;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }



	    public Timestamp getUpdated_at() {
	        return updated_at;
	    }

	    public void setUpdated_at(Timestamp updated_at) {
	        this.updated_at = updated_at;
	    }
	}

