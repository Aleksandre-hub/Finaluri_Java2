package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.accessibility.AccessibleState;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
public abstract class AppEntity {

    @Column(name = "Created_At", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date createdDate;

    @Column(name = "Update_At")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    protected Date lastModified;

    @Column(name = "Status")
    @Enumerated(EnumType.ORDINAL)
    protected RecordState recordState = RecordState.ACTIVE;

}

/*server.port=8081
spring.application.name=Basasuna
logging.file.name=spring_client_log.log
logging.file.max-size=20MB
spring.boot.admin.client.url=http://localhost:8080
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always adminis brdzaneba romelic iwereba recources -> application.properties axal proektshi ogont*/
