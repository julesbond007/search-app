search-app
==========

A very simple keyword search application built on top of apache lucene.

<p>Example using curl if your service is deployed under tomcat using 8080 port:</p>

<p><code>curl -X POST -H "Content-Type: application/json" -d '{"keyWord":"java"}' 'http://localhost:8080/api/v1/search'</code></p>
