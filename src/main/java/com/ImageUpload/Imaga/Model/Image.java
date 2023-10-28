package com.ImageUpload.Imaga.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.net.ProtocolFamily;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String name;
    private String type;

    @Lob
    private byte[] imageData;
    public static class Builder {
        private String name;
        private String type;
        private byte[] imageData;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder imageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }

        public Image build() {
            Image image = new Image();
            image.name = this.name;
            image.type = this.type;
            image.imageData = this.imageData;
            return image;
        }
    }


}
