public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomImageView custom = (CustomImageView) this.findViewById(R.id.custom);
        custom.setInfo("title", "description", "画像URL");
    }
}

