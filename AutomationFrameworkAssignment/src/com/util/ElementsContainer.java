package com.util;

import java.util.Collection;

public interface ElementsContainer {

    HtmlElement findElement(String locator);

    Collection<HtmlElement> findElements(String locator);

    String getDescription();
}

