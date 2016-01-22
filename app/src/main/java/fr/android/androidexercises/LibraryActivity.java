package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryActivity extends AppCompatActivity {

    private static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        List<Book> books = getBooks();

        // TODO findViewById() and setAdapter()
        RecyclerView bookRecyclerView = (RecyclerView) this.findViewById(R.id.book_recycler_view);
        bookRecyclerView.setHasFixedSize(true);

        GridLayoutManager mLayoutManager;
        mLayoutManager = new GridLayoutManager(this, getResources().getBoolean(R.bool.landscape) ? 2 : 1);

        bookRecyclerView.setLayoutManager(mLayoutManager);

        bookRecyclerView.setAdapter(new BookRecyclerAdapter(this, books));

    }


    private List<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            books.add(new Book(String.format("Garry Potier Tome %d", i), RANDOM.nextInt(30)));
        }
        return books;
    }

}
