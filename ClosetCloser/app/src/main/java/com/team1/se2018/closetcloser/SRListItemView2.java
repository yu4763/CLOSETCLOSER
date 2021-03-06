package com.team1.se2018.closetcloser;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.net.URL;

public class SRListItemView2 extends LinearLayout {

    ImageView codiImageOuter;
    ImageView codiImageTop;
    ImageView codiImageBottom;
    TextView mallName;
    TextView itemName;
    TextView itemPrice;
    Button gotoShop;

    public SRListItemView2 (Context context) {
        super(context);
        init(context);
    }

    public SRListItemView2 (Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_srlist_item_view2, this, true);

        codiImageOuter = (ImageView) findViewById(R.id.codi_image_outer);
        codiImageTop = (ImageView) findViewById(R.id.codi_image_top);
        codiImageBottom = (ImageView) findViewById(R.id.codi_image_bottom);
        mallName = (TextView) findViewById(R.id.mallname_sr2);
        itemName = (TextView) findViewById(R.id.itemname_sr2);
        itemPrice = (TextView) findViewById(R.id.itemprice_sr2);
        gotoShop = (Button) findViewById(R.id.redirect_shop);

    }

    public void setCodiImageOuter(Bitmap codi_image_outer_resID) {
        codiImageOuter.setImageBitmap(codi_image_outer_resID);
    }

    public void setCodiImageTop(Bitmap codi_image_top_resID) {
        codiImageTop.setImageBitmap(codi_image_top_resID);
    }

    public void setCodiImageBottom(Bitmap codi_image_bottom_resID) {
        codiImageBottom.setImageBitmap(codi_image_bottom_resID);
    }

    public void setMallName(String mall_name) {
        mallName.setText(mall_name);
    }

    public void setItemName(String item_name) {
        itemName.setText(item_name);
    }

    public void setItemPrice(String item_price) {
        itemPrice.setText(item_price);
    }

    public void setGotoShop(URL url) {
        gotoShop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to shopping mall

            }
        });
    }

}