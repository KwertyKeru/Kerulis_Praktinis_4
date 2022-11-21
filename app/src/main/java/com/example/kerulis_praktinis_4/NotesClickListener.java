package com.example.kerulis_praktinis_4;

import androidx.cardview.widget.CardView;

import com.example.kerulis_praktinis_4.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
