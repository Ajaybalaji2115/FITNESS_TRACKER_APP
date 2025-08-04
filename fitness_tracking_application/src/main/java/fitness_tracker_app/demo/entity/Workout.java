package fitness_tracker_app.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private int duration; // in minutes
    private int caloriesBurned;

    private LocalDate date;
    private String notes;

    // Constructors
    public Workout() {
    }

    public Workout(String type, int duration, int caloriesBurned, LocalDate date, String notes) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
        this.notes = notes;
    }

  
}
