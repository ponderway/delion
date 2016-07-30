package org.chromium.chrome.browser.omnibox;

/**
 * Created by yangdeli on 16-7-20.
 */
public class OmniboxSuggestionType {
    public static final int URL_WHAT_YOU_TYPED = 0;
    public static final int HISTORY_URL = 1;
    public static final int HISTORY_TITLE = 2;
    public static final int HISTORY_BODY = 3;
    public static final int HISTORY_KEYWORD = 4;
    public static final int NAVSUGGEST = 5;
    public static final int SEARCH_WHAT_YOU_TYPED = 6;
    public static final int SEARCH_HISTORY = 7;
    public static final int SEARCH_SUGGEST = 8;
    public static final int SEARCH_SUGGEST_ENTITY = 9;
    public static final int SEARCH_SUGGEST_TAIL = 10;
    public static final int SEARCH_SUGGEST_PERSONALIZED = 11;
    public static final int SEARCH_SUGGEST_PROFILE = 12;
    public static final int SEARCH_OTHER_ENGINE = 13;
    public static final int EXTENSION_APP = 14;
    public static final int CONTACT_DEPRECATED = 15;
    public static final int BOOKMARK_TITLE = 16;
    public static final int NAVSUGGEST_PERSONALIZED = 17;
    public static final int CALCULATOR = 18;
    public static final int CLIPBOARD = 19;
    public static final int VOICE_SUGGEST = 20;
    public static final int NUM_TYPES = 21;

    public OmniboxSuggestionType() {
    }
}
