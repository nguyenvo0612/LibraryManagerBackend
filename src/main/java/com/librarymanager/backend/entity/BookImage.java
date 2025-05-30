package com.librarymanager.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "book_images")
public class BookImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_image_id")
    private Integer bookImageId;
    @Column(name = "image_url")
    private String imageUrl;
    @CreationTimestamp
    @Column(name = "upload_at")
    private LocalDateTime uploadAt;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
