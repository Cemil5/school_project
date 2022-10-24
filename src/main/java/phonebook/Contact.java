package phonebook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
}
