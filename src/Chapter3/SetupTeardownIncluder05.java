package Chapter3;

public class SetupTeardownIncluder05 {
   private PageData pageData;

   private boolean isSuite;

   private WikiPage testPage;

   private StringBuffer newPageContent;

   private PageCrawler pageCrawler;

   public static String render(PageData pageData) throws Exception {
      return render(pageData, false);
   }

   private static String render(PageData pageData, boolean isSuite) throws Exception {
      return new SetupTeardownIncluder05(pageData).render(isSuite);
   }

   public SetupTeardownIncluder05(PageData pageData) {
      this.pageData = pageData;
      testPage = pageData.getWikiPage();
      pageCrawler = testPage.getPageCrawler();
      newPageContent = new StringBuffer();
   }

   private String render(boolean isSuite) throws Exception {
      this.isSuite = isSuite;
      if (isTestPage())
         includeSetupAndTeardownPages();
      return pageData.getHtml();
   }

   private boolean isTestPage() {
      return pageData.hasAtributte("Test");
   }

   private void includeSetupAndTeardownPages() throws Exception {
      includeSetupPages();
      includePageContent();
      includeTeardownPages();
      updatePageContent();
   }

   private void includeSetupPages() throws Exception {
      if (isSuite)
         includeSuiteSetupPage();
      includeSetupPage();

   }

   private void includeSuiteSetupPage() throws Exception {
      include(SuiteResponder.SUITE_SETUP_NAME, "-setup");
   }

   private void includeSetupPage() throws Exception {
      include("SetUp", "-setup");
   }

   private void includePageContent() throws Exception {
      newPageContent.append(pageData.getContent());
   }

   private void updatePageContent() {
      // TODO Auto-generated method stub

   }

   private void includeTeardownPages() {
      // TODO Auto-generated method stub

   }

   private void include(String pageName, String arg) throws Exception {
      WikiPage inheritedPage = findInheritedPage(pageName);
      if (inheritedPage != null) {
         String pagePathName = getPathNameForPage(inheritedPage);
         buildIncludeDirective(pagePathName, arg);
      }
   }

   private WikiPage findInheritedPage(String pageName) throws Exception {
      return PageCrawlerImpl.getInheritedPage(pageName, testPage);
   }

   private String getPathNameForPage(WikiPage page) throws Exception {
      WikiPagePath pagePath = pageCrawler.getFullPath(page);
      return PathParser.render(pagePath);
   }

   private void buildIncludeDirective(String pagePathName, String arg) {
      newPageContent.append("\n!include ").append(arg).append(" .").append(pagePathName).append("\n");
   }

}
