import React from 'react'
import useFetch from './services/useFetch';

export default function Loading() {
    const {data, loading} = useFetch('https://jsonplaceholder.typicode.com/posts');
    return (
    <div>
        <h1> {loading ? "Cargando..." : data}</h1>
    </div>
  )
}
