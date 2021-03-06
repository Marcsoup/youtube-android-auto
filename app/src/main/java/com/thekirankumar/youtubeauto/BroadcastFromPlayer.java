package com.thekirankumar.youtubeauto;

import android.content.Context;
import android.content.Intent;
import android.media.session.PlaybackState;

/**
 * Created by kiran.kumar on 11/01/18.
 */

class BroadcastFromPlayer {
    public static void broadcastPlayClicked(Context context) {
        Intent intent = new Intent(YoutubeMediaBrowserService.PLAYER_EVENT);
        intent.putExtra(YoutubeMediaBrowserService.ACTION_TYPE, PlaybackState.ACTION_PLAY);
        context.sendBroadcast(intent);
    }
    public static void broadcastPauseClicked(Context context) {
        Intent intent = new Intent(YoutubeMediaBrowserService.PLAYER_EVENT);
        intent.putExtra(YoutubeMediaBrowserService.ACTION_TYPE, PlaybackState.ACTION_PAUSE);
        context.sendBroadcast(intent);
    }
    public static void broadcastNextClicked(Context context) {
        Intent intent = new Intent(YoutubeMediaBrowserService.PLAYER_EVENT);
        intent.putExtra(YoutubeMediaBrowserService.ACTION_TYPE, PlaybackState.ACTION_SKIP_TO_NEXT);
        context.sendBroadcast(intent);
    }
    public static void broadcastPreviousClicked(Context context) {
        Intent intent = new Intent(YoutubeMediaBrowserService.PLAYER_EVENT);
        intent.putExtra(YoutubeMediaBrowserService.ACTION_TYPE, PlaybackState.ACTION_SKIP_TO_PREVIOUS);
        context.sendBroadcast(intent);
    }

    public static void broadcastVoiceSearch(Context context, String query) {
        Intent intent = new Intent(YoutubeMediaBrowserService.PLAYER_EVENT);
        intent.putExtra(YoutubeMediaBrowserService.ACTION_TYPE, PlaybackState.ACTION_PLAY_FROM_SEARCH);
        intent.putExtra(YoutubeMediaBrowserService.QUERY, query);
        context.sendBroadcast(intent);
    }
}
