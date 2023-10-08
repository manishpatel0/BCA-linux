<?xml version="1.0"?>
<xsl:stylesheet version="1.0"

xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
<html>
<head>
<title>XML XSL Example</title>
<style type="text/css">

body
{
margin:10px;
background-color:#ffffaa;
font-family:verdana,helvetica,sans-serif;
}
.test-text1
{
display:block;
font-weight:bold;
}
.test-text2
{
display:block;

color:#990000;
font-size:small;
font-style:italic;
}
.test-text3
{
display:block;
color:#009900;
font-size:small;
font-style:italic;
}
</style>

</head>
<body>
<h2>XML Transformation into HTML</h2>
<xsl:apply-templates/>
</body>
</html>
</xsl:template>
<xsl:template match="test">
<span class="test-text1"><xsl:value-of select="text1"/></span>
<span class="test-text2"><xsl:value-of select="text2"/></span>
<span class="test-text3"><xsl:value-of select="text3"/></span>
</xsl:template>
</xsl:stylesheet>