package com.euii.jager.utilities;

import java.util.Optional;

public enum EmoteReference {
    WAVING_HAND(":wave", "\uD83D\uDC4B"),
    WARNING("warning", "\u26a0"),
    REPEAT(":repeat_button:", "\uD83D\uDD01"),
    PAUSE(":pause_button:", "\u23f8"),
    PLAY(":arrow_forward:", "\u25b6"),
    COUNTERCLOCKWISE_ARROWS(":arrows_counterclockwise:", "\uD83D\uDD04"),
    CRYING_FACE(":cry:", "\uD83D\uDE22"),
    SLIGHT_FROWN(":slight_frown:", "\uD83D\uDE41"),
    HOURGLASS(":hourglass:", "\u231b"),
    STOPWATCH(":stopwatch:", "\u23f1"),
    SCROLL(":scroll:", "\uD83D\uDCDC"),
    GRIMACING(":grimace:", "\uD83D\uDE2C"),
    DOT("•", "\u2022"),
    SHUFFLE(":twisted_rightwards_arrows:", "\uD83D\uDD00"),
    X(":x:", "\u274C");

    final String notation;
    final String unicode;

    EmoteReference(String notation, String unicode) {
        this.notation = notation;
        this.unicode = unicode;
    }

    @Override
    public String toString() {
        return Optional.ofNullable(unicode).orElse(notation) + " ";
    }

    public String getNotation() {
        return notation;
    }

    public String getUnicode() {
        return unicode;
    }
}
