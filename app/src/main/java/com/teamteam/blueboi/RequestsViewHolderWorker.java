package com.teamteam.blueboi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by acer on 28/01/2018.
 */

public class RequestsViewHolderWorker extends RecyclerView.ViewHolder {

    TextView tvTitle;
    TextView tvDatetime;
    TextView tvLocation;
    Button btnAccept;
    Button btnReject;

    public RequestsViewHolderWorker (View itemView) {
        super(itemView);
        // insert find vie by ids here
    }
}
