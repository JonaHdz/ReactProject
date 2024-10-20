import {useEffect, useState} from 'react';

export const userFetch = (url) => {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        setLoading(true);
        fetch(url)
            .then((response) => response.json())
            .then((data) => {
                setData(data);
                setLoading(false);
            });
    }, [url]);

    return {data, loading};
}