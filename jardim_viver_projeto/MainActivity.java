import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEditText;
    private EditText sobrenomeEditText;
    private EditText emailEditText;
    private EditText idadeEditText;
    private EditText enderecoEditText;
    private Button enviarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        nomeEditText = findViewById(R.id.nomeEditText);
        sobrenomeEditText = findViewById(R.id.sobrenomeEditText);
        emailEditText = findViewById(R.id.emailEditText);
        idadeEditText = findViewById(R.id.idadeEditText);
        enderecoEditText = findViewById(R.id.enderecoEditText);
        enviarButton = findViewById(R.id.enviarButton);

        // Set click listener for submit button
        enviarButton.setOnClickListener(v -> {
            // Create DTO object with form data
            ParentDTO parentDTO = new ParentDTO(
                nomeEditText.getText().toString(),
                sobrenomeEditText.getText().toString(),
                emailEditText.getText().toString(),
                Integer.parseInt(idadeEditText.getText().toString()),
                enderecoEditText.getText().toString()
            );

            // TODO: Handle data persistence
            // This is where you would implement the database operations
        });
    }
}