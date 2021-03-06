package cn.jzvd.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.bumptech.glide.Glide;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import cn.jzvd.demo.CustomView.JzvdStdAutoCompleteAfterFullscreen;
import cn.jzvd.demo.CustomView.JzvdStdMp3;
import cn.jzvd.demo.CustomView.JzvdStdShowShareButtonAfterFullscreen;
import cn.jzvd.demo.CustomView.JzvdStdShowTextureViewAfterAutoComplete;
import cn.jzvd.demo.CustomView.JzvdStdShowTitleAfterFullscreen;
import cn.jzvd.demo.CustomView.JzvdStdVolumeAfterFullscreen;

/**
 * Created by Nathen on 16/7/31.
 */
public class ActivityApiUISmallChange extends AppCompatActivity {
    JzvdStdShowShareButtonAfterFullscreen jzVideoPlayerStandardWithShareButton;
    JzvdStdShowTitleAfterFullscreen jzVideoPlayerStandardShowTitleAfterFullscreen;
    JzvdStdShowTextureViewAfterAutoComplete jzVideoPlayerStandardShowTextureViewAfterAutoComplete;
    JzvdStdAutoCompleteAfterFullscreen jzVideoPlayerStandardAutoCompleteAfterFullscreen;
    JzvdStdVolumeAfterFullscreen jzVideoPlayerStandardVolumeAfterFullscreen;
    JzvdStdMp3 jzVideoPlayerStandardMp3;

    JzvdStd jzvdStd_1_1, jzvdStd_16_9;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("SmallChangeUI");
        setContentView(R.layout.activity_ui_small_change);

        jzVideoPlayerStandardWithShareButton = findViewById(R.id.custom_videoplayer_standard_with_share_button);
        jzVideoPlayerStandardWithShareButton.setUp(VideoConstant.videoUrlList[3], "饺子想呼吸", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbList[3])
                .into(jzVideoPlayerStandardWithShareButton.thumbImageView);


        jzVideoPlayerStandardShowTitleAfterFullscreen = findViewById(R.id.custom_videoplayer_standard_show_title_after_fullscreen);
        jzVideoPlayerStandardShowTitleAfterFullscreen.setUp(VideoConstant.videoUrlList[4], "饺子想摇头", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbList[4])
                .into(jzVideoPlayerStandardShowTitleAfterFullscreen.thumbImageView);

        jzVideoPlayerStandardShowTextureViewAfterAutoComplete = findViewById(R.id.custom_videoplayer_standard_show_textureview_aoto_complete);
        jzVideoPlayerStandardShowTextureViewAfterAutoComplete.setUp(VideoConstant.videoUrlList[5], "饺子想旅行", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbList[5])
                .into(jzVideoPlayerStandardShowTextureViewAfterAutoComplete.thumbImageView);

        jzVideoPlayerStandardAutoCompleteAfterFullscreen = findViewById(R.id.custom_videoplayer_standard_aoto_complete);
        jzVideoPlayerStandardAutoCompleteAfterFullscreen.setUp(VideoConstant.videoUrls[0][1], "饺子没来", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbs[0][1])
                .into(jzVideoPlayerStandardAutoCompleteAfterFullscreen.thumbImageView);

        jzvdStd_1_1 = findViewById(R.id.jz_videoplayer_1_1);
        jzvdStd_1_1.setUp(VideoConstant.videoUrls[0][1], "饺子有事吗", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbs[0][1])
                .into(jzvdStd_1_1.thumbImageView);
        jzvdStd_1_1.widthRatio = 1;
        jzvdStd_1_1.heightRatio = 1;

        jzvdStd_16_9 = findViewById(R.id.jz_videoplayer_16_9);
        jzvdStd_16_9.setUp(VideoConstant.videoUrls[0][1], "饺子来不了", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbs[0][1])
                .into(jzvdStd_16_9.thumbImageView);
        jzvdStd_16_9.widthRatio = 16;
        jzvdStd_16_9.heightRatio = 9;

        jzVideoPlayerStandardVolumeAfterFullscreen = findViewById(R.id.jz_videoplayer_volume);
        jzVideoPlayerStandardVolumeAfterFullscreen.setUp(VideoConstant.videoUrls[0][1], "饺子摇摆", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbs[0][1])
                .into(jzVideoPlayerStandardVolumeAfterFullscreen.thumbImageView);

        jzVideoPlayerStandardMp3 = findViewById(R.id.jz_videoplayer_mp3);
        jzVideoPlayerStandardMp3.setUp("https://in-20170815011809382-q34ludd68h.oss-cn-shanghai.aliyuncs.com/video/401edae1-16431aa8156-0007-1823-c86-de200.mp3?Expires=1532102862&OSSAccessKeyId=LTAIPZHZDaUNpnca&Signature=apruidffjNeN0O584VJiz8q1mJ4%3D", "饺子摇摆", Jzvd.SCREEN_WINDOW_NORMAL
                );
        Glide.with(this)
                .load(VideoConstant.videoThumbs[0][1])
                .into(jzVideoPlayerStandardMp3.thumbImageView);


    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
