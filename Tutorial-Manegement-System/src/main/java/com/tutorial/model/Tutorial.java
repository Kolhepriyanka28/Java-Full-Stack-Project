package com.tutorial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tutorials")
	public class Tutorial {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		@Column(name = "title")
		private String title;

		@Column(name = "description")
		private String description;

		@Column(name = "published")
		private boolean published;

		public Tutorial(String title, String description, boolean published) {
			super();
			this.title = title;
			this.description = description;
			this.published = published;
		}
		
}


