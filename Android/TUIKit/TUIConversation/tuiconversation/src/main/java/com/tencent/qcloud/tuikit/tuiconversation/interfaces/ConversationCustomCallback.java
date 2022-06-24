package com.tencent.qcloud.tuikit.tuiconversation.interfaces;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationBaseHolder;

/**
 * 会话列表 自定义 item
 * @author xz
 */
public interface ConversationCustomCallback {
     ConversationBaseHolder getCustomHolder(@NonNull ViewGroup parent);
}
