public class CustomImageView extends RelativeLayout {
    private Context mContext;

    <!-- コンストラクタは3つ用意しました。 API21からは4つのコンストラクタが使えるようです-->
    public CustomImageView(Context context) {
        this(context, null);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mContext = context;

        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.custom_image_view, this, true);
    }

    public void setInfo(String title, String description, String imageUrl) {
        ImageView imageView = findViewById(R.id.icon);

        Glide.with(getApplicationContext())
                .load(imageUrl)
                .placeholder(R.drawable.placeholder)
                .into(imageView);

        ((TextView) findViewById(R.id.title)).setText(title);
        ((TextView) findViewById(R.id.description)).setText(description);
        invalidate();
    }
}
