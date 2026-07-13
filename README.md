# Simple maven app for testing

## use an isolated cache
``` bash
export MAVEN_OPTS="-Dmaven.repo.local=/tmp/empty-m2"
rm -rf /tmp/empty-m2

mvn -Dmaven.repo.local=/tmp/empty-m2 -s settings.xml clean install
```
## then scan
``` bash
endorctl scan --use-local-repo-cache --languages java
```