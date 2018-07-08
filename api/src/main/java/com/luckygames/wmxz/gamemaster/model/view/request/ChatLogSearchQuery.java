package com.luckygames.wmxz.gamemaster.model.view.request;

public class ChatLogSearchQuery extends CommonSearchQuery {
    private String charName;
    private String keyword;
    private String chatChannel;

    public String getChatChannel() {
        return chatChannel;
    }

    public void setChatChannel(String chatChannel) {
        this.chatChannel = chatChannel;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
