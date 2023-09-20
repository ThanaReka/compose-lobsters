# Claw for [lobste.rs](https://lobste.rs) [![CI](https://github.com/msfjarvis/compose-lobsters/actions/workflows/ci.yml/badge.svg)](https://github.com/msfjarvis/compose-lobsters/actions/workflows/ci.yml)

Unofficial Android app for read-only access to [lobste.rs](https://lobste.rs), built with [Jetpack Compose](https://developer.android.com/jetpack/compose).

<a href="https://play.google.com/store/apps/details?id=dev.msfjarvis.claw.android">
  <img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png"
       alt="Get it on Google Play"
       height="80" />
</a>

> Snapshots from the development branch can be obtained [here](https://github.com/msfjarvis/compose-lobsters/releases/tag/nightly).

<img src="https://github.com/msfjarvis/compose-lobsters/blob/main/.github/readme_feature.webp"
     alt="A grid of screenshots from the app, in clockwise order: the main screen, the comments page, the search page and the saved posts page"
     width="550" />

## Module dependency graph

```mermaid
%%{
  init: {
    'theme': 'dark'
  }
}%%

graph TB

  model --> database
  benchmark --> android
  android --> api
  android --> common
  android --> core
  android --> database
  android --> model
  android --> benchmark
  api --> model
  common --> core
  common --> database
  common --> model
```
## License

See [LICENSE](LICENSE)
