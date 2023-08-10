package com.alphawallet.app.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DappBrowserUtilsTest
{
    @Test
    public void testDefaultDapp()
    {
        assertThat(DappBrowserUtils.defaultDapp(1L), equalTo("https://www.evadore.io/r.php?p=1"));
        assertThat(DappBrowserUtils.defaultDapp(137L), equalTo("https://www.evadore.io/r.php?p=2"));
        assertThat(DappBrowserUtils.defaultDapp(80001L), equalTo("https://www.evadore.io/r.php?p=3"));
    }

    @Test
    public void testIsDefaultDapp()
    {
        assertTrue(DappBrowserUtils.isDefaultDapp("https://www.evadore.io/r.php?p=4"));
        assertTrue(DappBrowserUtils.isDefaultDapp("https://www.evadore.io/r.php?p=5"));
        assertFalse(DappBrowserUtils.isDefaultDapp("https://www.evadore.io/r.php?p=6"));
    }

    @Test
    public void testIsWithinHomePage()
    {
        assertTrue(DappBrowserUtils.isWithinHomePage("https://www.evadore.io/r.php?p=7"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://www.evadore.io/r.php?p=8"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://www.evadore.io/r.php?p=9"));
        assertFalse(DappBrowserUtils.isWithinHomePage("https://www.evadore.io/r.php?p=10"));
    }
}
